import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C_1213945443 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Toolbar.class);
      ToolbarWidgetWrapper var1 = new ToolbarWidgetWrapper((Toolbar)var2, false);
      ToolbarWidgetWrapper var3 = var1;
      Object var4 = EasyMock.createMock(Drawable.class);
      var3.setNavigationIcon((Drawable)var4);
   }
}
