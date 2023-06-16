package com.conec.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class control {
    @Autowired
    private repo repo;
    @Autowired
    private repodep repodep;
    @Autowired
    private repoemplo repoemplo;

    @GetMapping("/veremp")
    public List<enterprices> getEnterprices(){
      return repo.findAll();
    }

    @PostMapping("saveemp")
    public ResponseEntity<?> saveEnterprices(@RequestBody enterprices enterprices){
      repo.save(enterprices);
      return ResponseEntity.ok("{\"message\": \"guardado\"}");
    }

    @PutMapping("upemp/{id}")
    public ResponseEntity<?> updateEnterprices(@PathVariable long id,@RequestBody enterprices enterprices){
      enterprices upenterprices=repo.findById(id).get();
      upenterprices.setCreated_by(enterprices.getCreated_by());
      upenterprices.setCreated_date(enterprices.getCreated_date());
      upenterprices.setModified_by(enterprices.getModified_by());
      upenterprices.setModified_date(enterprices.getModified_date());
      upenterprices.setStatus(enterprices.getStatus());
      upenterprices.setAddress(enterprices.getAddress());
      upenterprices.setName(enterprices.getName());
      upenterprices.setPhone(enterprices.getPhone());
      repo.save(upenterprices);
      return ResponseEntity.ok("{\"message\": \"actualizado\"}");
    }
    @GetMapping("/verdep")
    public List<departments> getDepartments(){
      return repodep.findAll();
    }
    @PostMapping("/savedep")
    public ResponseEntity<?> saveDepartments(@RequestBody departments departments){
      repodep.save(departments);
      return ResponseEntity.ok("{\"message\": \"guardado\"}");
    }
    @PutMapping("updep/{id}")
    public ResponseEntity<?> updateDepartments(@PathVariable long id,@RequestBody departments departments){
      departments updepartments=repodep.findById(id).get();
      updepartments.setCreated_by(departments.getCreated_by());
      updepartments.setCreated_date(departments.getCreated_date());
      updepartments.setModified_by(departments.getModified_by());
      updepartments.setModified_date(departments.getModified_date());
      updepartments.setStatus(departments.getStatus());
      updepartments.setDescription(departments.getDescription());
      updepartments.setName(departments.getName());
      updepartments.setPhone(departments.getPhone());
      repodep.save(updepartments);
      return ResponseEntity.ok("{\"message\": \"actualizado\"}");
    }
    @GetMapping("/veremplo")
    public List<employees> getEmployees(){
      return repoemplo.findAll();
    }
    @PostMapping("saveemplo")
    public ResponseEntity<?> saveEmployees(@RequestBody employees employees){
      repoemplo.save(employees);
      return ResponseEntity.ok("{\"message\": \"guardado\"}");
    }
    @PutMapping("upemplo/{id}")
    public ResponseEntity<?> updateEmployees(@PathVariable long id,@RequestBody employees employees){
      employees upemployees=repoemplo.findById(id).get();
      upemployees.setCreated_by(employees.getCreated_by());
      upemployees.setCreated_date(employees.getCreated_date());
      upemployees.setModified_by(employees.getModified_by());
      upemployees.setModified_date(employees.getModified_date());
      upemployees.setStatus(employees.getStatus());
      upemployees.setAge(employees.getAge());
      upemployees.setEmail(employees.getEmail());
      upemployees.setName(employees.getName());
      upemployees.setPosition(employees.getPosition());
      upemployees.setSurname(employees.getSurname());
      repoemplo.save(upemployees);
      return ResponseEntity.ok("{\"message\": \"actualizado\"}");
    }

    /*@GetMapping("/empresas")
     public List<Empresa> obtener() {
        List<Empresa> empresas = new ArrayList<>();

        // Lógica para llenar la lista de empresas
        empresas.add(new Empresa(1, "Empresa 1", "Dirección 1"));
        empresas.add(new Empresa(2, "Empresa 2", "Dirección 2"));
        empresas.add(new Empresa(3, "Empresa 3", "Dirección 3"));

        return empresas;
    }*/
  /*public String handleGetRequest() {
    // Lógica para manejar la solicitud GET
    return "Respuesta de la solicitud GET";
  }*/
   // @PostMapping("/empresas")
   //  public String handlePostRequest() {
    // Lógica para manejar la solicitud GET
  //  return "Respuesta de la solicitud POST";
  //}
  /*public String handlePostRequest(@RequestBody datos datos) {
    // Aquí puedes manejar la lógica de la petición y generar la respuesta adecuada
  //   Por ejemplo, podrías procesar los datos recibidos y devolver un mensaje como respuesta
    String mensaje = "La petición POST se ha procesado correctamente.";
    return mensaje;
  }*/
}
