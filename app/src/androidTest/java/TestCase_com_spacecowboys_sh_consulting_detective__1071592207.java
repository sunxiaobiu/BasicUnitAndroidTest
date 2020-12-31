import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_spacecowboys_sh_consulting_detective__1071592207 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(PageTransformer.class);
      Object var1 = EasyMock.createMock(View.class);
      float var2 = 1.0F;
      ((PageTransformer)var3).transformPage((View)var1, var2);
   }
}
