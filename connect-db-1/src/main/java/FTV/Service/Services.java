package FTV.Service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import FTV.Entity.DM_TRIEN_KHAI;

public interface Services {
	List<DM_TRIEN_KHAI> getALl();
	List<DM_TRIEN_KHAI> findByCriteria(String moTa);
	List<DM_TRIEN_KHAI> findByLikeCriteria(String text);
	List<DM_TRIEN_KHAI> findByPagingCriteria(String mota,Pageable pageable);
}
