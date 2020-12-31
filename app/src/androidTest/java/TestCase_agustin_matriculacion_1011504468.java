import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_agustin_matriculacion_1011504468 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent("android.intent.action.SEND");
      String var1 = "android";
      var2.putExtra("android.intent.extra.EMAIL", var1);
   }
}
