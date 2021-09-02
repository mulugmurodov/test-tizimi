package uz.srt.srtpaybackend.service;

public interface GenericCrudService<T, C> {
    T get(Long id);

//    Page<T> list(E criteria);

    T create(C dto);

    T update(Long id, C dto);

    void delete(Long id);
}
