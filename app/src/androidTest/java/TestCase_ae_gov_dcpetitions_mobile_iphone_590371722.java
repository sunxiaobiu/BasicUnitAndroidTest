import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_590371722 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Activity var2 = (Activity)var1;
      Intent var3 = var2.getIntent();
      boolean var4 = var3.hasExtra("PUSH_RECEIVE_EVENT");
   }
}
