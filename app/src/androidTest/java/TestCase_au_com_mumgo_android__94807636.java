import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android__94807636 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Activity var2 = (Activity)var1;
      View var3 = var2.findViewById(2131427681);
      DrawerLayout var4 = (DrawerLayout)var3;
      var4.setDrawerShadow(2130837722, 8388611);
   }
}
