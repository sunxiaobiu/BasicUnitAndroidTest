import android.support.v7.widget.ListPopupWindow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_vvl_mobile_android_ticketing_1035461902 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ListPopupWindow.class);
      ((ListPopupWindow)var1).dismiss();
   }
}
