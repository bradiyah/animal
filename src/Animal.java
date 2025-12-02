public abstract class Animal {
  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void getNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setNombre (String nombre){
    this.nombre = nombre;
  }


  public abstract String hacersonido();
  public abstract String comer();


};

