package FTV.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import FTV.Entity.DM_TRIEN_KHAI;



@Repository
public interface TrienKhaiRepo extends CrudRepository<DM_TRIEN_KHAI, Long>, JpaRepository<DM_TRIEN_KHAI, Long>,JpaSpecificationExecutor<DM_TRIEN_KHAI> {
	

}
