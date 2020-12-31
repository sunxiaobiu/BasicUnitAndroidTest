import android.content.Context;
import android.support.v4.widget.EdgeEffectCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_custom_jfeye_2040644508 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      EdgeEffectCompat var1 = new EdgeEffectCompat(var2);
      EdgeEffectCompat var3 = var1;
      float var4 = 1.0F;
      var3.onPull(var4);
   }
}
