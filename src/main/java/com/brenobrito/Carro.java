package com.brenobrito;

public class Carro
{

  private CarroEstado estado = CarroEstadoDisponivel.getInstance();

  public CarroEstado getEstado()
  {
    return estado;
  }

  void setEstado(CarroEstado estado)
  {
    this.estado = estado;
  }

  public void disponivel()
  {
    this.estado.disponivel(this);
  }

  public void reservado()
  {
    this.estado.reservado(this);
  }

  public void alugado()
  {
    this.estado.alugado(this);
  }

  public void emManutencao()
  {
    this.estado.emManutencao(this);
  }

  public void inativo()
  {
    this.estado.inativo(this);
  }
}
