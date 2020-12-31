import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aol_mobile_aolapp__931986393 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutInflater.class);
      Object var1 = EasyMock.createMock(ViewGroup.class);
      View var3 = ((LayoutInflater)var2).inflate(2131427516, (ViewGroup)var1, false);
      var3 = var3.findViewById(2131297019);
      Toolbar var4 = (Toolbar)var3;
      var4.dismissPopupMenus();
   }
}
