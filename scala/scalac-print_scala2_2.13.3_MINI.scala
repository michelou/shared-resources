[[syntax trees at end of                   cleanup]] // ScalaFXHelloWorld.scala
package hello {
  object ScalaFXHelloWorld extends Object with scalafx.application.JFXApp {
    def delayedInit(x: Function0): Unit = ScalaFXHelloWorld.super.delayedInit(x);
    def main(args: Array[String]): Unit = ScalaFXHelloWorld.super.main(args);
    final private[application] def init(): Unit = ScalaFXHelloWorld.super.init();
    def hostServices(): scalafx.application.HostServices = ScalaFXHelloWorld.super.hostServices();
    def stopApp(): Unit = ScalaFXHelloWorld.super.stopApp();
    override <accessor> def stage(): scalafx.application.JFXApp$PrimaryStage = (ScalaFXHelloWorld.this.stage: scalafx.application.JFXApp$PrimaryStage);
    private[this] var stage: scalafx.application.JFXApp$PrimaryStage = _;
    override <accessor> def stage_=(x$1: scalafx.application.JFXApp$PrimaryStage): Unit = ScalaFXHelloWorld.this.stage = (x$1: scalafx.application.JFXApp$PrimaryStage);
    override <accessor> def arguments(): scala.collection.Seq = (ScalaFXHelloWorld.this.arguments: scala.collection.Seq);
    private[this] var arguments: scala.collection.Seq = _;
    override <accessor> def arguments_=(x$1: scala.collection.Seq): Unit = ScalaFXHelloWorld.this.arguments = (x$1: scala.collection.Seq);
    override <stable> <accessor> def subClassInitCode(): scala.collection.mutable.ListBuffer = (ScalaFXHelloWorld.this.subClassInitCode: scala.collection.mutable.ListBuffer);
    private[this] var subClassInitCode: scala.collection.mutable.ListBuffer = _;
    final <synthetic> lazy private[this] var parameters: scalafx.application.JFXApp$Parameters = _;
    private def parameters$lzycompute(): scalafx.application.JFXApp$Parameters = {
      ScalaFXHelloWorld.this.synchronized(if (ScalaFXHelloWorld.this.bitmap$0.unary_!())
        {
          ScalaFXHelloWorld.this.parameters = ((ScalaFXHelloWorld.super.parameters(): scalafx.application.JFXApp$Parameters): scalafx.application.JFXApp$Parameters);
          ScalaFXHelloWorld.this.bitmap$0 = true
        });
      ScalaFXHelloWorld.this.parameters
    };
    override <stable> <accessor> lazy protected def parameters(): scalafx.application.JFXApp$Parameters = (if (ScalaFXHelloWorld.this.bitmap$0.unary_!())
      ScalaFXHelloWorld.this.parameters$lzycompute()
    else
      ScalaFXHelloWorld.this.parameters: scalafx.application.JFXApp$Parameters);
    final override <accessor> protected[this] def subClassInitCode_=(x$1: scala.collection.mutable.ListBuffer): Unit = ScalaFXHelloWorld.this.subClassInitCode = (x$1: scala.collection.mutable.ListBuffer);
    @volatile private[this] var bitmap$0: Boolean = _;
    final <synthetic> def delayedEndpoint$hello$ScalaFXHelloWorld$1: Unit = {
      ScalaFXHelloWorld.this.stage_=({
        new <$anon: scalafx.application.JFXApp$PrimaryStage>()
      });
      ()
    };
    def <init>(): hello.ScalaFXHelloWorld.type = {
      ScalaFXHelloWorld.super.<init>();
      ScalaFXHelloWorld.super./*JFXApp*/$init$();
      ScalaFXHelloWorld.this.delayedInit(new hello.ScalaFXHelloWorld$delayedInit$body(ScalaFXHelloWorld.this));
      ()
    }
  };
  final class anon$1 extends scalafx.application.JFXApp$PrimaryStage {
    def <init>(): <$anon: scalafx.application.JFXApp$PrimaryStage> = {
      anon$1.super.<init>();
      anon$1.this.title_=("ScalaFX Hello World");
      ()
    }
  };
  final <synthetic> class ScalaFXHelloWorld$delayedInit$body extends runtime.AbstractFunction0 {
    <paramaccessor> private[this] val $outer: hello.ScalaFXHelloWorld.type = _;
    final def apply(): Object = {
      ScalaFXHelloWorld$delayedInit$body.this.$outer.delayedEndpoint$hello$ScalaFXHelloWorld$1();
      scala.runtime.BoxedUnit.UNIT
    };
    def <init>($outer: hello.ScalaFXHelloWorld.type): hello.ScalaFXHelloWorld$delayedInit$body = {
      if ($outer.eq(null))
        throw null
      else
        ScalaFXHelloWorld$delayedInit$body.this.$outer = $outer;
      ScalaFXHelloWorld$delayedInit$body.super.<init>();
      ()
    }
  }
}

