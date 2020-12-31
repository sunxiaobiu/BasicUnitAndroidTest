import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_aussiecommerce_cudo_1677331505 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LayoutInflater.class);
      View var2 = ((LayoutInflater)var1).inflate(2130968655, (ViewGroup)null);
      ViewGroup var3 = (ViewGroup)var2;
      var2 = var3.findViewById(2131755411);
      ViewPager var4 = (ViewPager)var2;
      var4.clearOnPageChangeListeners();
   }
}
