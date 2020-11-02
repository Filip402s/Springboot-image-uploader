package salapat.com.IMGuploader.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import salapat.com.IMGuploader.model.Image;

public interface ImageRepo extends JpaRepository<Image, Long> {


}
