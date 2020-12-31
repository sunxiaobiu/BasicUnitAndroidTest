import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5DBBEF20D6AE038837D19758A6E61B0007A223BAAEB2135EAFB93B20DB510909_93010355 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ViewParent var3 = ((View)var2).getParent();
      ViewGroup var4 = (ViewGroup)var3;
      LayoutTransition var5 = var4.getLayoutTransition();
      byte var1 = 1;
      var5.disableTransitionType(var1);
   }
}
