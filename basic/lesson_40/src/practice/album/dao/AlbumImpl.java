package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album{

    static Comparator<Photo> comparator = (p1,p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return res !=0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        // нельзя добавить null, нельзя photo.length == capacity, нельзя добавить то же самое photo (проверка на два id)
        // нужно иметь отсортированный массив
        // нужно применить binarySearch (получим индекс в массиве), чтобы найти место, куда вставить фото
        // тогда можно делать addPhoto
        if(photo == null || photos.length == size || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator); // нашли место, куда вставить в массив photo
        index = index >=0 ? index : - index -1;
        System.arraycopy(photos, index, photos, index + 1, size - index); // копируем эл-ты массива от index на 1 место вправо
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                System.arraycopy(photos,i+1,photos,i,size - 1 - i);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        for (int i = 0; i < photos.length; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                photos[i].setUrl(url);
                return true;
            }
        }
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null); // создаем объект, с которым сравниваем photo из массива
        for (int i = 0; i < size; i++) {
            if(pattern.equals(photos[i])) {
                return photos[i];
            }
        }
        return null;
    }

//    @Override
//    public Photo[] getAllPhotoFromAlbum(int albumId) {
//        Photo[] albumPhotos = new Photo[0];
//        int count = 0;
//
//        for (int i = 0; i < photos.length; i++) {
//            if (photos[i].getAlbumId() == albumId) {
//                Photo[] newAlbumPhotos = new Photo[count+1];
//                System.arraycopy(albumPhotos, 0, newAlbumPhotos, 0, count);
//                newAlbumPhotos[count] = photos[i];
//                albumPhotos = newAlbumPhotos;
//                count++;
//            }
//        }
//        return albumPhotos;
//    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findByPredicate(p -> p.getAlbumId() == albumId);
    }


    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Photo[] photosBetweenDates = new Photo[0];
        int count = 0;

        for (int i = 0; i < photos.length; i++) {
            LocalDate creationDate = photos[i].getDate().toLocalDate();
            System.out.println("Checking date: " + creationDate);

            if (isAfterOrEqual(creationDate,dateFrom) && isBeforeOrEqual(creationDate,dateTo)) {
                System.out.println("Found photo between dates: " + photos[i].getPhotoId());
                Photo[] newPhotosBetweenDates = new Photo[count + 1];
                System.arraycopy(photosBetweenDates, 0, newPhotosBetweenDates, 0, count);
                newPhotosBetweenDates[count] = photos[i];
                photosBetweenDates = newPhotosBetweenDates;
                count++;
            }
        }
        return photosBetweenDates;
    }

    private Photo[] findByPredicate(Predicate<Photo> predicate) {
        Photo[] res = new Photo[size];
        int j = 0; // счетчик найденных по условию фото
        for (int i = 0; i < size; i++) {
            if(predicate.test(photos[i])) {
                res[j++] = photos[i];
            }
        }
        return Arrays.copyOf(res, j); // копируем только
    }


    public static boolean isAfterOrEqual(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2) || date1.isEqual(date2);
    }

    public static boolean isBeforeOrEqual(LocalDate date1, LocalDate date2) {
        return date1.isBefore(date2) || date1.isEqual(date2);
    }



    @Override
    public int size() {
        return size;
    }
}


