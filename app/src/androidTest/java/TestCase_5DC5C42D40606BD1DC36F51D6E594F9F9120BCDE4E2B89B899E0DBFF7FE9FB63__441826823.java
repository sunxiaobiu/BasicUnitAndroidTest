import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5DC5C42D40606BD1DC36F51D6E594F9F9120BCDE4E2B89B899E0DBFF7FE9FB63__441826823 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      LinearLayout var1 = new LinearLayout(var2);
      var2 = InstrumentationRegistry.getTargetContext();
      ActivityGroup var3 = (ActivityGroup)var2;
      LocalActivityManager var4 = var3.getLocalActivityManager();
   }
}
