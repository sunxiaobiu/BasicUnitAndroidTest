import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2C44AEC328DFDA6B10DB5EDDF4731045C8D88320C24AE654BDF973012D2D6156_1511772580 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ActionMenuItemView.class);
      Object var1 = EasyMock.createMock(Drawable.class);
      ((ActionMenuItemView)var2).setCompoundDrawables((Drawable)var1, (Drawable)null, (Drawable)null, (Drawable)null);
   }
}
