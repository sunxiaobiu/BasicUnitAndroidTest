import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_28E9EAD2C4CE32FB24F6DBDA9B8711A8EF2B214A67EF477AE9D909C82D67055D_1202530332 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Toolbar.class);
      ToolbarWidgetWrapper var1 = new ToolbarWidgetWrapper((Toolbar)var2, false);
      View var3 = var1.getCustomView();
   }
}
