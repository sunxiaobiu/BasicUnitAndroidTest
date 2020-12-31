import android.content.ClipboardManager;
import android.content.ClipboardManager.OnPrimaryClipChangedListener;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_1632215441 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("clipboard");
      ClipboardManager var4 = (ClipboardManager)var3;
      Object var1 = EasyMock.createMock(OnPrimaryClipChangedListener.class);
      var4.removePrimaryClipChangedListener((OnPrimaryClipChangedListener)var1);
   }
}
