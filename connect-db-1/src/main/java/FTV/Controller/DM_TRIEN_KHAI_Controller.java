package FTV.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FTV.Entity.DM_TRIEN_KHAI;
import FTV.Repo.TrienKhaiRepo;
import FTV.Service.ServiceImpl;


@CrossOrigin("*")
@RestController
@RequestMapping("trienkhai")
public class DM_TRIEN_KHAI_Controller {
	
	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping("/get")
	public List<DM_TRIEN_KHAI> getALLTK()
	{
		return serviceImpl.getALl();
	}
	
//	@GetMapping("/get/{ten}")
//	public List<DM_TRIEN_KHAI> getbynameor(@PathVariable String ten){
//		return serviceImpl.findByCriteria(ten);
//	}
	@GetMapping("/get/{ten}")
	public List<DM_TRIEN_KHAI> getmany(@PathVariable String ten ){
		return serviceImpl.findByLikeCriteria(ten);
	}
	
	@GetMapping("/paging/{ten}/{paging}")
	public List<DM_TRIEN_KHAI> getPagingByName(@PathVariable String ten , @PathVariable int paging ){
		
		
		return serviceImpl.findByPagingCriteria(ten,PageRequest.of(0, paging) );
	}
}
