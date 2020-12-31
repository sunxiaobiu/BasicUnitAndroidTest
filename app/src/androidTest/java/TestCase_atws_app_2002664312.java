import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app_2002664312 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatActivity.class);
      LayoutInflater var3 = ((AppCompatActivity)var2).getLayoutInflater();
      View var4 = var3.inflate(2131493041, (ViewGroup)null);
      DrawerLayout var5 = (DrawerLayout)var4;
      var2 = EasyMock.createMock(AppCompatActivity.class);
      var3 = ((AppCompatActivity)var2).getLayoutInflater();
      var4 = var3.inflate(2131493041, (ViewGroup)null);
      var5 = (DrawerLayout)var4;
      var4 = var5.findViewById(2131362969);
      NavigationView var6 = (NavigationView)var4;
      Object var1 = EasyMock.createMock(LinearLayout.class);
      var6.addHeaderView((View)var1);
   }
}
