import android.content.Context;
import android.support.v4.widget.EdgeEffectCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_custom_jfeye__734016079 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      EdgeEffectCompat var1 = new EdgeEffectCompat(var2);
      boolean var3 = var1.isFinished();
   }
}
