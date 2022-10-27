public class Main {

  public static void main(String[] args) {

    Persona persona = new Persona();
    persona.setNombre("Luis");
    persona.setTelefono(542122355);
    System.out.println(persona.getNombre());
    System.out.println(persona.getTelefono());

    Cliente cliente = new Cliente();
    cliente.setNombre("Juan");
    cliente.setTelefono(654235466);
    cliente.setCredito(1000000);
    System.out.println(cliente.getNombre());
    System.out.println(cliente.getTelefono());
    System.out.println(cliente.getCredito());

    Trabajador trabajador = new Trabajador();
    trabajador.setSalario(20000);
    System.out.println(trabajador.getSalario());

  }
}

class Persona {
  int edad;
  String nombre;
  int telefono;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getTelefono() {
    return this.telefono;
  }
}

class Cliente extends Persona {
  int credito;

  public void setCredito(int credito) {
    this.credito = credito;
  }

  public int getCredito() {
    return this.credito;
  }

}

class Trabajador extends Persona {
  int salario;

  public void setSalario(int salario) {
    this.salario = salario;
  }

  public int getSalario() {
    return this.salario;
  }
}