fun main(){
var car =Car("Toyota","corolla","blue",5)
    var bus = Bus("Isuzu","latest","Yellow",52)
    car.carry(5)
    car.carry(8)
    car.identity()
    car.calculateParkingFees(2)
    println(bus.maxTripFare(200.00))
    println(bus.calculateParkingFees(2))

}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x = people - capacity
     if (people <= capacity){
         println("carrying $people passengers")
     }
        else{
            println("overcapacity by $x people")
     }
    }
    fun identity(){
       println("Iam a $color $make $model")
    }
   open fun calculateParkingFees(hours:Int): Int {
        var parkingFees=hours*20
        return parkingFees
    }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){

    fun maxTripFare(fare:Double): Double {
       var maxFare = fare*capacity
        return maxFare

    }
    override fun calculateParkingFees(hours: Int): Int {
       // return super.calculateParkingFees(hours)
        var fee = hours*capacity
        return fee
    }
}