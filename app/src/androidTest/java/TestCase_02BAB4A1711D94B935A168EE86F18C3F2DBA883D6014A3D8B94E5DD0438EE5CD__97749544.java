import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02BAB4A1711D94B935A168EE86F18C3F2DBA883D6014A3D8B94E5DD0438EE5CD__97749544 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ActionBarContainer var3 = (ActionBarContainer)var2;
      Object var1 = EasyMock.createMock(ScrollingTabContainerView.class);
      var3.setTabContainer((ScrollingTabContainerView)var1);
   }
}
