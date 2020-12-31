import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.RecycledViewPool;
import android.support.v7.widget.RecyclerView.ViewHolder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5DD7D9D85974F75DCF3B704F8782BD3D0CE7B566AF05DC3C66D5ABDC33A4D1F5_1105112712 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(RecyclerView.class);
      RecycledViewPool var3 = ((RecyclerView)var2).getRecycledViewPool();
      Object var1 = EasyMock.createMock(ViewHolder.class);
      var3.putRecycledView((ViewHolder)var1);
   }
}
