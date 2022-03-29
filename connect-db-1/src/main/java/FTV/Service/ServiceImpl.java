package FTV.Service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;



import FTV.Entity.DM_TRIEN_KHAI;
import FTV.Repo.TrienKhaiRepo;

@Service
public class ServiceImpl implements Services {

	@Autowired
	private TrienKhaiRepo trienKhaiRepo;
	
	@Override
	public List<DM_TRIEN_KHAI> getALl() {
		
		return trienKhaiRepo.findAll(new Specification<DM_TRIEN_KHAI>() {
            @Override
            public Predicate toPredicate(Root<DM_TRIEN_KHAI> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return null;
            }
        });
	}
	
	public List<DM_TRIEN_KHAI> findByCriteria(String moTa){
        return trienKhaiRepo.findAll(new Specification<DM_TRIEN_KHAI>() {
            @Override
            public Predicate toPredicate(Root<DM_TRIEN_KHAI> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(moTa!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("mDTK"), moTa)));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }
	public List<DM_TRIEN_KHAI> findByLikeCriteria(String text ){
        return trienKhaiRepo.findAll(new Specification<DM_TRIEN_KHAI>() {
            @Override
            public Predicate toPredicate(Root<DM_TRIEN_KHAI> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(text!=null) {
                    predicates.add(criteriaBuilder.or(criteriaBuilder.like(root.get("moTa"), "%" + text + "%"),
                            criteriaBuilder.like(root.get("ghiChu"), "%" + text + "%")));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }
	
	 public List<DM_TRIEN_KHAI> findByPagingCriteria(String mota,Pageable pageable){
	        Page page = trienKhaiRepo.findAll(new Specification<DM_TRIEN_KHAI>() {
	            @Override
	            public Predicate toPredicate(Root<DM_TRIEN_KHAI> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
	                List<Predicate> predicates = new ArrayList<>();
	                if(mota!=null) {
	                    predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("moTa"), "%"+mota+"%")));
	                }
	                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	            }
	        }, pageable);

	        page.getTotalElements();        // get total elements
	        page.getTotalPages();           // get total pages
	        return page.getContent();       // get List of Employee
	    }

	
	
	

}
