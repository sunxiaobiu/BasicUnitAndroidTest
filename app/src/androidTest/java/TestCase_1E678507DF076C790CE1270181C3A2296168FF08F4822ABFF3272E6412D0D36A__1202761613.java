import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import androidx.viewpager.widget.ViewPager;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1E678507DF076C790CE1270181C3A2296168FF08F4822ABFF3272E6412D0D36A__1202761613 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ViewGroup.class);
      ViewPager var3 = (ViewPager)var2;
      Object var1 = EasyMock.createMock(View.class);
      var3.removeView((View)var1);
   }
}
