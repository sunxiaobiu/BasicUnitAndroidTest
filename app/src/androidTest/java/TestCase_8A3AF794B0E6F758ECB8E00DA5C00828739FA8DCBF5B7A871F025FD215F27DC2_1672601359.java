import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_8A3AF794B0E6F758ECB8E00DA5C00828739FA8DCBF5B7A871F025FD215F27DC2_1672601359 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      ListPopupWindow var4 = new ListPopupWindow(var3);
      Object var1 = EasyMock.createMock(ArrayAdapter.class);
      var4.setAdapter((ListAdapter)var1);
   }
}
