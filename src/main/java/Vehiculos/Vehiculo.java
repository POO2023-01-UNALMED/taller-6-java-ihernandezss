package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		Vehiculo.cantidadVehiculos++;
		
		
		int ubiventfabri=Fabricante.listaFabricantes.indexOf(fabricante)+1;
		int valorActualventfabri = (int) Fabricante.listaFabricantes.get(ubiventfabri);
		Fabricante.listaFabricantes.set(ubiventfabri,valorActualventfabri ++);; 
		
		int ubiventpais=Pais.listaPaises.indexOf(fabricante.getPais())+1;
		int valorActualventpais=(int) Pais.listaPaises.get(ubiventpais);
		Pais.listaPaises.set(ubiventpais,valorActualventpais++);

	}
	
	public void setPlaca(String placa) {
		this.placa = placa;}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;}
	
	public void setvelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;}
	
	public void setPrecio (int precio) {
		this.precio=precio;}
	
	public void setPeso (int peso) {
		this.peso=peso;}
	
	public void setTraccion (String traccion) {
		this.traccion=traccion;
	}
	public void setFabricante (Fabricante fabricante) {
		this.fabricante=fabricante;}
	
	public String getPlaca() {
		return placa;}
	
	public int getPuertas() {
		return puertas;}
	
	public int getvelocidadMaxima () {
		return velocidadMaxima;}
	
	public String getNombre() {
		return nombre;}
	
	public int getPrecio () {
		return precio;}
	
	public int getPeso () {
		return peso;}
	
	public String getTraccion () {
		return traccion;}
	
	public Fabricante getFabricante () {
		return fabricante;}
	
	public void setCantidadVehiculos(int CantidadVehiculos) {
		Vehiculo.CantidadVehiculos=CantidadVehiculos;}
	
	public int getCantidadVehiculos () {
		return Vehiculo.CantidadVehiculos;}
	
	//metodos vehiculosportipo
	public String vehiculosPorTipo() {
		return "Automóviles: "+Automovil.getCantidadAutomoviles()+"\nCamionetas: "+Camioneta.getCantidadCamionetas()+"\nCamiones: "+Camion.getCantidadCamiones();
}
}