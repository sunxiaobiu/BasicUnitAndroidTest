import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_1160717146 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Resources var2 = var1.getResources();
      String var4 = var1.getPackageName();
      int var5 = var2.getIdentifier("dyloadconfig", "xml", var4);
      XmlResourceParser var3 = var2.getXml(var5);
      var3.next();
   }
}
