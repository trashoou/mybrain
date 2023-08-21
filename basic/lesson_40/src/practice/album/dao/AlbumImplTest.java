package practice.album.dao;

import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    AlbumImpl album;

    Photo[] photos;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        album = new AlbumImpl(3);
        photos = new Photo[] {
          new Photo(1,901,"New York","https://www.citysignal.com/wp-content/uploads/2021/10/most-instagrammable-nyc-spots.jpeg", LocalDateTime.of(2023,8,10,20,22)),
          new Photo(1,902,"New Yokk","https://www.citysignal.com/wp-content/uploads/2021/10/most-instagrammable-nyc-spots.jpeg", LocalDateTime.of(2023,8,14,20,22)),
          new Photo(1,903,"New York","https://www.citysignal.com/wp-content/uploads/2021/10/most-instagrammable-nyc-spots.jpeg", LocalDateTime.of(2023,8,16,20,22))
        };

        for (int i = 0; i < photos.length; i++) {
            album.addPhoto(photos[i]);
        }
    }




    @org.junit.jupiter.api.Test
    void addPhotoTest() {
        Photo ap = new Photo(2,904,"Los Angeles","https://images.ctfassets.net/rc3dlxapnu6k/2sHDye6BYDw5Ze3wTcZdeG/a8a8cf4e7ecd2460e20e478e063c1d97/USA__Kalifornien__Los_Angeles.jpg?w=2203&h=1239&fl=progressive&q=50&fm=jpg", LocalDateTime.now());
        assertFalse(album.addPhoto(ap));
    }

    @org.junit.jupiter.api.Test
    void removePhotoTest() {
        assertTrue(album.removePhoto(903,1));
    }

    @org.junit.jupiter.api.Test
    void updatePhotoTest() {
        assertTrue(album.updatePhoto(903,1,"https://scpr.brightspotcdn.com/dims4/default/88a4f98/2147483647/strip/true/crop/4032x3024+0+0/resize/880x660!/quality/90/?url=http%3A%2F%2Fscpr-brightspot.s3.amazonaws.com%2Fd8%2F13%2F53be072f46069e8124d01e3f35da%2Fimg-6947.jpg"));
    }

    @org.junit.jupiter.api.Test
    void getPhotoFromAlbumTest() {
        assertEquals(photos[1], album.getPhotoFromAlbum(902,1));
    }

    @org.junit.jupiter.api.Test
    void getAllPhotoFromAlbumTest() {
        Photo[] expected = {photos[0],photos[1],photos[2]};
        assertArrayEquals(expected, album.getAllPhotoFromAlbum(1));
    }

    @Test
    void getPhotoBetweenDateTest() {
        Photo[] expected = {photos[0],photos[1]};
        LocalDate dateFrom = LocalDate.of(2023,8,10);
        LocalDate dateTo = LocalDate.of(2023,8,14);
        assertArrayEquals(expected, album.getPhotoBetweenDate(dateFrom,dateTo));
    }
}



