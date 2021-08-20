object Q41{

    class Account(id:String , n:Int , b:Double){
        var nic: String = id;
        var accnumber: Int = n;
        var balance: Double = b;

        val overdraft = (b : List[Account]) =>
            b.filter(x => x.balance<0)
    }
    
    def main(args:Array[String]){
        var x: List[Account] = List(new Account("Lakshan",11,1500) , new Account("Mihiranga",12,2000))
        
    }
}