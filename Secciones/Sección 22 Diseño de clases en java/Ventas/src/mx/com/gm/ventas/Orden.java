
package mx.com.gm.ventas;
public class Orden {
    //1
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int Max_PRODUCTOS= 10;
  //------- 
   //2
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
       this.productos = new Producto[Orden.Max_PRODUCTOS];
    }
    public void agregarProducto(Producto producto){
        if (this.contadorProductos <Orden.Max_PRODUCTOS){
            
            productos[contadorProductos++]= producto;
        }
           
        else {
                    System.out.println("Se ha superado el maximo de productos" + Orden.Max_PRODUCTOS);
                    
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i <this.contadorProductos; i++) {
           // Producto producto = this.productos[i];
            //total += producto.getPrecio();// total = total + producto.getPrecio()
            total += this.productos[i].getPrecio();
        }
    return total;
    }
    public void mostrarOrden(){
        System.out.println("IdOrden = "+this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $"+ totalOrden);
        System.out.println("Productos de la orden");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
   //------
}
