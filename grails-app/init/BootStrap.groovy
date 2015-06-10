import multi.db.example.Foo
import multi.db.example.Bar

class BootStrap {

    def init = { servletContext ->

      def a1 = new Foo(name:"Fred")
      a1.save(failOnError:true)

      def a2 = new Bar(name:"Barney")
      a2.save(failOnError:true)
     
    }
    def destroy = {
    }
}
