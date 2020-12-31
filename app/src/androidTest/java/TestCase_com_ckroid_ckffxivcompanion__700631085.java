import android.support.v4.view.PagerTabStrip;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ckroid_ckffxivcompanion__700631085 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutInflater.class);
      Object var1 = EasyMock.createMock(ViewGroup.class);
      View var3 = ((LayoutInflater)var2).inflate(2130968664, (ViewGroup)var1, false);
      var3 = var3.findViewById(2131689770);
      PagerTabStrip var4 = (PagerTabStrip)var3;
      byte var5 = 1;
      var4.setTabIndicatorColor(var5);
   }
}
