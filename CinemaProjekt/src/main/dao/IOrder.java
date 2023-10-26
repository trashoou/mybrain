package main.dao;

import java.util.List;

/**
 * Интерфейс IOrder предоставляет контракт для класса, представляющего заказ в системе управления кинотеатром.
 */
public interface IOrder {

    /**
     * Получить список билетов, входящих в этот заказ.
     *
     * @return Список билетов заказа.
     */
    List<ITicket> getTickets();

    /**
     * Добавить билет в этот заказ.
     *
     * @param ticket Билет, который следует добавить в заказ.
     */
    void addTicket(ITicket ticket);

    /**
     * Удалить билет из этого заказа.
     *
     * @param ticket Билет, который следует удалить из заказа.
     */
    void removeTicket(ITicket ticket);

    /**
     * Получить статус этого заказа (например, новый, подтвержденный, отмененный).
     *
     * @return Статус заказа.
     */
    String getStatus();

    /**
     * Установить статус для этого заказа.
     *
     * @param status Новый статус заказа.
     */
    void setStatus(String status);

    /**
     * Получить общую стоимость этого заказа, рассчитывая сумму стоимости всех билетов в заказе.
     *
     * @return Общая стоимость заказа.
     */
    double getTotalPrice();

    /**
     * Оплатить заказ, изменяя его статус и обновляя статус связанных билетов.
     */
    void pay();

    void addProduct(IProduct product, int quantity);
}