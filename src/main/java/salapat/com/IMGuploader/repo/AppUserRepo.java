package salapat.com.IMGuploader.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salapat.com.IMGuploader.model.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long> {

    public AppUser findByUsername(String username);


}
