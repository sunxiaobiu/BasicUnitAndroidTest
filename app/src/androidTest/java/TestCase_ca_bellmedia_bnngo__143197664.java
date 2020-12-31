import android.app.ActionBar;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_bellmedia_bnngo__143197664 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ActionBar.class);
      Object var1 = EasyMock.createMock(View.class);
      ((ActionBar)var2).setCustomView((View)var1);
   }
}
