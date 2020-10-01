result of W:\scalafx-examples\scalafx-hello-world\src\main\scala\hello\ScalaFXHelloWorld.scala after MegaPhase{lambdaLift, elimStaticThis, countOuterAccesses}:
package hello {
  final lazy module val ScalaFXHelloWorld: hello.ScalaFXHelloWorld$ = new hello.ScalaFXHelloWorld$()
  @scala.annotation.internal.SourceFile("W:\\scalafx-examples\\scalafx-hello-world\\src\\main\\scala\\hello\\ScalaFXHelloWorld.scala") final module class ScalaFXHelloWorld$ extends Object, scalafx.application.JFXApp {
    def <init>(): Unit = 
      {
        super()
        super[JFXApp].$init$()
        hello.ScalaFXHelloWorld.stage_=(
          {
            new scalafx.application.JFXApp.PrimaryStage {...}():scalafx.application.JFXApp.PrimaryStage
          }
        )
        ()
      }
    @scala.annotation.static() @scala.annotation.static() val OFFSET$_m_0: Long = dotty.runtime.LazyVals.getOffset(classOf[Object with scalafx.application.JFXApp {...}], "0bitmap$1")
    private var stage: scalafx.application.JFXApp.PrimaryStage
    def stage(): scalafx.application.JFXApp.PrimaryStage = hello.ScalaFXHelloWorld.stage
    private var scalafx$application$JFXApp$$arguments: scala.collection.Seq
    def scalafx$application$JFXApp$$arguments(): scala.collection.Seq = hello.ScalaFXHelloWorld.scalafx$application$JFXApp$$arguments
    private var scalafx$application$JFXApp$$subClassInitCode: scala.collection.mutable.ListBuffer
    def scalafx$application$JFXApp$$subClassInitCode(): scala.collection.mutable.ListBuffer = hello.ScalaFXHelloWorld.scalafx$application$JFXApp$$subClassInitCode
    protected lazy var parameters$lzy1: scalafx.application.JFXApp.Parameters = null.asInstanceOf[scalafx.application.JFXApp.Parameters]
    lazy var 0bitmap$1: Long = 0L
    protected lazy def parameters(): scalafx.application.JFXApp.Parameters = 
      while <empty> do 
        {
          val flag: Long = dotty.runtime.LazyVals.get(this, hello.ScalaFXHelloWorld.OFFSET$_m_0)
          val state: Long = dotty.runtime.LazyVals.STATE(flag, 0)
          if state.==(3) then return hello.ScalaFXHelloWorld.parameters$lzy1 else 
            if state.==(0) then 
              if dotty.runtime.LazyVals.CAS(this, hello.ScalaFXHelloWorld.OFFSET$_m_0, flag, 1, 0) then 
                try 
                  {
                    val result: scalafx.application.JFXApp.Parameters = super[JFXApp].parameters()
                    hello.ScalaFXHelloWorld.parameters$lzy1 = result
                    dotty.runtime.LazyVals.setFlag(this, hello.ScalaFXHelloWorld.OFFSET$_m_0, 3, 0)
                    return result
                  }
                 catch 
                  {
                    case ex$ @ ex$ => 
                      dotty.runtime.LazyVals.setFlag(this, hello.ScalaFXHelloWorld.OFFSET$_m_0, 0, 0)
                      throw ex$
                  }
               else ()
             else dotty.runtime.LazyVals.wait4Notification(this, hello.ScalaFXHelloWorld.OFFSET$_m_0, flag, 0)
        }
    def stage_=(x$1: scalafx.application.JFXApp.PrimaryStage): Unit = hello.ScalaFXHelloWorld.stage = x$1
    def scalafx$application$JFXApp$$arguments_=(x$1: scala.collection.Seq): Unit = hello.ScalaFXHelloWorld.scalafx$application$JFXApp$$arguments = x$1
    def scalafx$application$JFXApp$_setter_$scalafx$application$JFXApp$$subClassInitCode_=(x$0: scala.collection.mutable.ListBuffer): Unit = hello.ScalaFXHelloWorld.scalafx$application$JFXApp$$subClassInitCode = x$0
    def delayedInit(x: Function0): Unit = super[JFXApp].delayedInit(x)
    def main(args: String[]): Unit = super[JFXApp].main(args)
    final private[application] def init(): Unit = super[JFXApp].init()
    def hostServices(): scalafx.application.HostServices = super[JFXApp].hostServices()
    def stopApp(): Unit = super[JFXApp].stopApp()
    private def writeReplace(): Object = new scala.runtime.ModuleSerializationProxy(classOf[hello.ScalaFXHelloWorld$])
    private final <static> class $anon$1 extends scalafx.application.JFXApp.PrimaryStage {
      def <init>(): Unit = 
        {
          super()
          this.title_=("ScalaFX Hello World")
          ()
        }
    }
  }
}
