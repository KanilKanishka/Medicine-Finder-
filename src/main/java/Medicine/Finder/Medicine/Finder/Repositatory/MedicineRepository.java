package Medicine.Finder.Medicine.Finder.Repositatory;

import Medicine.Finder.Medicine.Finder.Entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository <Medicine,Integer> {
Medicine findByName(String name);

}
