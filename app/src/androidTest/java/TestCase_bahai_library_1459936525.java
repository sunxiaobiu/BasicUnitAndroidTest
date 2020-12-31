import android.support.v4.widget.PopupWindowCompat;
import android.view.View;
import android.widget.PopupWindow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bahai_library_1459936525 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(View.class);
      byte var2 = 1;
      byte var3 = 1;
      byte var4 = 1;
      PopupWindowCompat.showAsDropDown((PopupWindow)var0, (View)var1, var2, var3, var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
