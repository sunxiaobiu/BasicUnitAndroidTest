import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_1382323083 {
   @Test
   public void testCase() throws Exception {
      short var2 = 16384;
      AccessibilityEvent var1 = AccessibilityEvent.obtain(var2);
      AccessibilityRecordCompat var3 = new AccessibilityRecordCompat(var1);
      Object var4 = EasyMock.createMock(View.class);
      var3.setSource((View)var4);
   }
}
