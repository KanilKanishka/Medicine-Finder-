package Medicine.Finder.Medicine.Finder.Controller;

import Medicine.Finder.Medicine.Finder.Entity.Medicine;
import Medicine.Finder.Medicine.Finder.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("Medicinedetails")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping(path ="/addMedicine")
    public Medicine addMedicine(@RequestBody Medicine medicine){
        return medicineService.saveMedicine(medicine);
    }

    @PostMapping(path ="/addMedicines")
    public List<Medicine> addMedicines(@RequestBody List<Medicine> medicines){
        return medicineService.saveMedicine(medicines);
    }

    @GetMapping("/Medicines")
    public List<Medicine> findAllMedicines(){
        return medicineService.getMedicines();
    }

    @GetMapping("/medicineById/{id}")
    public Medicine findMedicineById(@PathVariable int id) {
        return medicineService.getMedicineById(id);
    }

    @GetMapping("/medicine/{name}")
    public Medicine findMedicineByName(@PathVariable String name) {
        return medicineService.getMedicineByName(name);
    }

    @PutMapping("/update")
    public Medicine updateMedicine(@RequestBody Medicine product) {
        return medicineService.updateMedicine(product);
    }

    @DeleteMapping(path ="/delete/{id}")
    public String deleteMedicine(@PathVariable int id) {
        return medicineService.deleteMedicine(id);
    }
}
