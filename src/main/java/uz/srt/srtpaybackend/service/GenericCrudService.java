package uz.srt.srtpaybackend.service;

import javax.transaction.Transactional;

public interface GenericCrudService<T, C> {
    T get(Long id);

//    Page<T> list(E criteria);

    @Transactional
    T create(C dto);

    T update(Long id, C dto);

    void delete(Long id);
}
