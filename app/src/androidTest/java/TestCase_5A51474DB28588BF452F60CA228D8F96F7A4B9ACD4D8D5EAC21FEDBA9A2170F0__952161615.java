import android.os.Parcelable;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A51474DB28588BF452F60CA228D8F96F7A4B9ACD4D8D5EAC21FEDBA9A2170F0__952161615 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(NavigationView.class);
      View var3 = ((NavigationView)var2).findViewById(2131296310);
      RecyclerView var4 = (RecyclerView)var3;
      LayoutManager var5 = var4.getLayoutManager();
      Object var1 = EasyMock.createMock(Parcelable.class);
      var5.onRestoreInstanceState((Parcelable)var1);
   }
}
