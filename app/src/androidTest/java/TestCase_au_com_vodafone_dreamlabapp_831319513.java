import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp_831319513 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent("action.stats.changed");
      float var1 = 1.0F;
      var2.putExtra("extra.stats.percentage_completed", var1);
   }
}
