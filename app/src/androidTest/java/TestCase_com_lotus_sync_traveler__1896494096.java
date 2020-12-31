import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_lotus_sync_traveler__1896494096 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(LayoutInflater.class);
      View var6 = ((LayoutInflater)var5).inflate(2131427488, (ViewGroup)null);
      ViewGroup var7 = (ViewGroup)var6;
      var6 = var7.findViewById(2131296821);
      AppBarLayout var9 = (AppBarLayout)var6;
      LayoutParams var1 = var9.getLayoutParams();
      CoordinatorLayout.LayoutParams var8 = (CoordinatorLayout.LayoutParams)var1;
      Behavior var10 = var8.getBehavior();
      AppBarLayout.Behavior var11 = (AppBarLayout.Behavior)var10;
      Object var2 = EasyMock.createMock(CoordinatorLayout.class);
      byte var3 = 1;
      int[] var4 = new int[1];
      var11.onNestedPreScroll((CoordinatorLayout)var2, var9, (View)null, 0, var3, var4);
   }
}
