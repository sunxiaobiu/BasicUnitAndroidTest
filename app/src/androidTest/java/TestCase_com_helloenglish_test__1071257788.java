import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ToolbarWidgetWrapper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_helloenglish_test__1071257788 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Toolbar.class);
      ToolbarWidgetWrapper var1 = new ToolbarWidgetWrapper((Toolbar)var2, false);
      ToolbarWidgetWrapper var3 = var1;
      byte var4 = 1;
      var3.setNavigationContentDescription(var4);
   }
}
