package Medicine.Finder.Medicine.Finder.Service;

import Medicine.Finder.Medicine.Finder.Entity.Medicine;
import Medicine.Finder.Medicine.Finder.Repositatory.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository repository;

    public MedicineService() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Medicine saveMedicine(Medicine medicine) {
        return repository.save(medicine);
    }

    public List<Medicine> saveMedicine(List<Medicine> medicine) {
        return repository.saveAll(medicine);
    }

    public List<Medicine> getMedicines() {
        return repository.findAll();
    }

    public Medicine getMedicineById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Medicine getMedicineByName(String name) {
        return repository.findByName(name);
    }

    public String deleteMedicine(int id) {
        repository.deleteById(id);
        return "medicine removed !! " + id;
    }

    public Medicine updateMedicine(Medicine medicine) {
        Medicine existingMedicine = repository.findById(medicine.getId()).orElse(null);
        existingMedicine.setName(medicine.getName());
        existingMedicine.setQuantity(medicine.getQuantity());
        existingMedicine.setPrice(medicine.getPrice());
        return repository.save(existingMedicine);
    }


}
