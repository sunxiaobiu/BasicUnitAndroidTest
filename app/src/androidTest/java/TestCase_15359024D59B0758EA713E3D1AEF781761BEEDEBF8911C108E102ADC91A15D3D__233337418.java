import android.app.ActionBar;
import android.app.Activity;
import android.app.ActionBar.Tab;
import android.content.Context;
import android.view.View;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_15359024D59B0758EA713E3D1AEF781761BEEDEBF8911C108E102ADC91A15D3D__233337418 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      Context var2 = InstrumentationRegistry.getTargetContext();
      Activity var3 = (Activity)var2;
      ActionBar var4 = var3.getActionBar();
      Tab var5 = var4.getSelectedTab();
   }
}
