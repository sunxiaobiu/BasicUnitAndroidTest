import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_android_AbcApplication_993090104 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ActionBarContainer var3 = (ActionBarContainer)var2;
      Object var1 = EasyMock.createMock(ScrollingTabContainerView.class);
      var3.setTabContainer((ScrollingTabContainerView)var1);
   }
}
